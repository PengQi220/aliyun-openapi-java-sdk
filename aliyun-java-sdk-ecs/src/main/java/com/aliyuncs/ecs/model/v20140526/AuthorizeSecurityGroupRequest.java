/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AuthorizeSecurityGroupRequest extends RpcAcsRequest<AuthorizeSecurityGroupResponse> {
	
	public AuthorizeSecurityGroupRequest() {
		super("Ecs", "2014-05-26", "AuthorizeSecurityGroup", "ecs");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String securityGroupId;

	private String ipProtocol;

	private String portRange;

	private String sourceGroupId;

	private String sourceGroupOwnerAccount;

	private String sourceCidrIp;

	private String policy;

	private String priority;

	private String nicType;

	private String clientToken;

	private String ownerAccount;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		putQueryParameter("SecurityGroupId", securityGroupId);
	}

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		putQueryParameter("IpProtocol", ipProtocol);
	}

	public String getPortRange() {
		return this.portRange;
	}

	public void setPortRange(String portRange) {
		this.portRange = portRange;
		putQueryParameter("PortRange", portRange);
	}

	public String getSourceGroupId() {
		return this.sourceGroupId;
	}

	public void setSourceGroupId(String sourceGroupId) {
		this.sourceGroupId = sourceGroupId;
		putQueryParameter("SourceGroupId", sourceGroupId);
	}

	public String getSourceGroupOwnerAccount() {
		return this.sourceGroupOwnerAccount;
	}

	public void setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
		this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
		putQueryParameter("SourceGroupOwnerAccount", sourceGroupOwnerAccount);
	}

	public String getSourceCidrIp() {
		return this.sourceCidrIp;
	}

	public void setSourceCidrIp(String sourceCidrIp) {
		this.sourceCidrIp = sourceCidrIp;
		putQueryParameter("SourceCidrIp", sourceCidrIp);
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		putQueryParameter("Policy", policy);
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		putQueryParameter("Priority", priority);
	}

	public String getNicType() {
		return this.nicType;
	}

	public void setNicType(String nicType) {
		this.nicType = nicType;
		putQueryParameter("NicType", nicType);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		putQueryParameter("ClientToken", clientToken);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<AuthorizeSecurityGroupResponse> getResponseClass() {
		return AuthorizeSecurityGroupResponse.class;
	}

}
