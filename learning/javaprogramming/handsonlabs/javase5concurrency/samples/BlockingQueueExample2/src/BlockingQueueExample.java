import java.net.*;
import java.io.*;
import java.util.concurrent.*;

/**
 *  Send messages to a Logger via a BlockingQueue
 **/
public class BlockingQueueExample implements Runnable {
    private BlockingQueue<String> messageQueue;
    private int id;
    private int count;
    private long pause;
    
    /**
     *  Constructor
     *
     * @param messageQueue The quese to send messages to
     * @param id The ID number of this sender
     * @param count The number of messages to send
     * @param pause The pause between sending each message
     **/
    public BlockingQueueExample(BlockingQueue<String> messageQueue, int id,
            int count, long pause) {
        this.messageQueue = messageQueue;
        this.id = id;
        this.count = count;
        this.pause = pause;
    }
    
    /**
     *  Run method to send the messages
     **/
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                messageQueue.put("ID " + id + ": log message number " + i);
                Thread.sleep(pause);
            }
        } catch (InterruptedException ie) {
            //  Ignore
        }
    }
    
    /**
     *  Main entry point for running test scenario
     *
     * @param args The command line arguments
     **/
    public static void main(String[] args) {
        
    /*  For the test we will need a BlockingQueue to be used by both threads
     *  Initially use an ArrayBlockingQueue which is the simplest concrete
     *  implementation of the BlockingQueue interface.  The constructor takes
     *  the size of the queue as a parameter
     */
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
        
    /*  Use the utility method from the Executors class to get an
     *  ExcutorService reference that will allow us to execute a single
     *  thread
     */
        ExecutorService loggerExecutor = Executors.newSingleThreadExecutor();
        loggerExecutor.execute(new Logger(queue));
        
    /*  Now create a new fixed size thread pool to allow us to run
     *  (in this case) three sender threads
     */
        ExecutorService senderExecutor = Executors.newFixedThreadPool(3);
        senderExecutor.execute(new BlockingQueueExample(queue, 1, 5, 400));
        senderExecutor.execute(new BlockingQueueExample(queue, 2, 5, 800));
        senderExecutor.execute(new BlockingQueueExample(queue, 3, 5, 1200));
    }
}
