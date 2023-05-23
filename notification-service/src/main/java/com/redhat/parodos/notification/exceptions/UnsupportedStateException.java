/*
 * Copyright (c) 2022 Red Hat Developer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.parodos.notification.exceptions;

/**
 * The UnsupportedStateException is used when a Notification State is not found or is
 * unsupported.
 *
 * @author Gloria Ciavarrini (Github: gciavarrini)
 */
public class UnsupportedStateException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UnsupportedStateException(String message) {
		super(message);
	}

}
