<!--
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements. See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
-->

<%@ taglib prefix="s" uri="/struts-tags" %>

<title>User Details</title>

<h2>User Details </h2>
<table>
    <tr>
        <td><b>ID</b></td>
        <td><s:property value="user.id"/></td>
    </tr>
    <tr>
        <td><b>First Name</b></td>
        <td><s:property value="user.firstName"/></td>
    </tr>
    <tr>
        <td><b>Last Name</b></td>
        <td><s:property value="user.lastName"/></td>
    </tr>
</table>
