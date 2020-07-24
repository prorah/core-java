package com.fis.threads;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class FolderProcessor extends RecursiveTask<List<String>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Stores the path of the directory
	private String path;
	// stores the extension of the file
	private String extension;

	public FolderProcessor(String path, String extension) {
		super();
		this.path = path;
		this.extension = extension;
	}

	@Override
	protected List<String> compute() {
		File file = new File(path);
		File[] content = file.listFiles();

		List<String> fileNames = new ArrayList<>();
		List<FolderProcessor> tasks = new ArrayList<FolderProcessor>();

		if (content != null) {
			for (int i = 0; i < content.length; i++) {
				if (content[i].isDirectory()) {
					FolderProcessor task = new FolderProcessor(content[i].getAbsolutePath(), extension);
					task.fork();
					tasks.add(task);
				}
				// Otherwise, compare the extension of the file with the
				// extension you are looking for using the checkFile() method
				// and, if they are equal, store the full path of the file in
				// the list of strings declared earlier.
				else {
					if (checkFile(content[i].getName())) {
						fileNames.add(content[i].getAbsolutePath());
					}
				}
			}
		}

		// add to the list of files the results returned by the subtasks
		// launched by this task.
		addResultsFromTasks(fileNames, tasks);
		// Return the list of strings
		return fileNames;
	}

	// For each task stored in the list of tasks, call the join() method that
	// will wait for its finalization and then will return the result of the
	// task.
	// Add that result to the list of strings using the addAll() method.
	private void addResultsFromTasks(List<String> list, List<FolderProcessor> tasks) {
		for (FolderProcessor item : tasks) {
			list.addAll(item.join());
		}
	}

	// This method compares if the name of a file passed as a parameter ends
	// with the extension you are looking for.
	private boolean checkFile(String name) {
		return name.endsWith(extension);
	}
}
