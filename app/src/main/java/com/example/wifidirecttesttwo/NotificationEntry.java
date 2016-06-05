
/*
 * Copyright 2013 Yufeng Duan, Politecnico di Torino, Turin, Italy
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

package com.example.wifidirecttesttwo;

import java.net.InetAddress;

public class NotificationEntry {
	
	private String serviceName;
	private InetAddress providerAddress;
	private InetAddress destAddress;
	
	
	public NotificationEntry(String serviceName, InetAddress provider, InetAddress dest){
		this.serviceName = serviceName;
		this.providerAddress = provider;
		this.destAddress = dest;
	}
	
	public String getServiceName(){
		return this.serviceName;
	}
	
	public InetAddress getDestAddress(){
		return this.destAddress;
	}

	public InetAddress getProviderAddress(){
		return this.providerAddress;
	}
}