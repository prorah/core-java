package com.fis.threads;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

//This class demonstrates ForkJoinPool
public class ForkJoinPoolTest {

	 public static void main(String[] args)
	   {
	      //Create ForkJoinPool using the default constructor.
	      ForkJoinPool pool = new ForkJoinPool();
	      //Create FolderProcessor task and Initialize with a folder path
	      FolderProcessor documents = new FolderProcessor("D:\\Self", "docx");
	     
	      //Execute the task in the pool using the invoke() method.
	      List<String> results=pool.invoke(documents);
	      //Write to the console information about the status of the pool every second
	      //until the task finishes its execution.
	      do
	      {
	         System.out.printf("******************************************\n");
	         System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());
	         System.out.printf("Main: Active Threads: %d\n", pool.getActiveThreadCount());
	         System.out.printf("Main: Task Count: %d\n", pool.getQueuedTaskCount());
	         System.out.printf("Main: Steal Count: %d\n", pool.getStealCount());
	         System.out.printf("******************************************\n");
	         try
	         {
	            TimeUnit.SECONDS.sleep(1);
	         } catch (InterruptedException e)
	         {
	            e.printStackTrace();
	         }
	      } while ((!documents.isDone()));
	      //Shut down ForkJoinPool using the shutdown() method.
	      pool.shutdown();
	      System.out.printf("Documents: %d files found.\n", results.size());
	   }

}
