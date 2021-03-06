/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jayway.restassured.authentication

import com.jayway.restassured.internal.http.HTTPBuilder

import java.security.KeyStore

class CertAuthScheme implements AuthenticationScheme {
    def String certURL
    def String password
    def String certType = KeyStore.getDefaultType()
    def int port = 443
    def KeystoreProvider trustStoreProvider

    @Override
    void authenticate(HTTPBuilder httpBuilder) {
        httpBuilder.auth.certificate(certURL, password, certType, port, trustStoreProvider)
    }
}
