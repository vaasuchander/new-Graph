/**
 * 
 */
package com.deloitte.model.json;

import com.deloitte.model.PlaybookTask;

/**
 * @author vbejjanki
 *
 */
public class ExecutionNodeJson {

	private long id;

	private PlaybookTask task;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PlaybookTask getTask() {
		return task;
	}

	public void setTask(PlaybookTask task) {
		this.task = task;
	}

}
