/*
 * Copyright 2016 qyh.me
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.qyh.blog.core.event;

import org.springframework.context.ApplicationEvent;

import me.qyh.blog.core.entity.Lock;

public class LockUpdateEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Lock oldLock;
	private final Lock newLock;

	public LockUpdateEvent(Object source, Lock oldLock, Lock newLock) {
		super(source);
		this.oldLock = oldLock;
		this.newLock = newLock;
	}

	public Lock getOldLock() {
		return oldLock;
	}

	public Lock getNewLock() {
		return newLock;
	}

}
