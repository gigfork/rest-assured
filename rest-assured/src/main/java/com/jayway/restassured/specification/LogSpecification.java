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

package com.jayway.restassured.specification;

/**
 * Base interface for request- and response log specifications.
 */
public interface LogSpecification<T extends RequestSender> {

    /**
     * Logs only the content of the body. The body will be pretty-printed by default if content-type is either XML, JSON or HTML.
     *
     * @return The specification
     */
    T body();

    /**
     * Logs only the content of the body and pretty-print the body if specified. Note that pretty-printing can only take place if the
     * content-type is either XML, JSON or HTML.
     *
     * @param shouldPrettyPrint <code>true</code> if the body should be pretty-printed, <code>false</code> otherwise.
     * @return The specification
     */
    T body(boolean shouldPrettyPrint);

    /**
     * Logs everything in the specification, including e.g. headers, cookies, body.   Pretty-prints the body if content-type is either either XML, JSON or HTML..
     *
     * @return The specification
     */
    T all();

    /**
     * Logs everything in the specification, including e.g. headers, cookies, body with the option to pretty-print the body if the content-type is
     * either XML, JSON or HTML..
     *
     * @param shouldPrettyPrint <code>true</code> if the body should be pretty-printed, <code>false</code> otherwise.
     * @return The specification
     */
    T all(boolean shouldPrettyPrint);

    /**
     ** Logs everything in the specification, including e.g. headers, cookies, body. Pretty-prints the body if content-type is either either XML, JSON or HTML..
     *
     * @return The specification
     */
    T everything();

    /**
     ** Logs everything in the specification, including e.g. headers, cookies, body with the option to pretty-print the body if the content-type is
     * either XML, JSON or HTML..
     *
     * @param shouldPrettyPrint <code>true</code> if the body should be pretty-printed, <code>false</code> otherwise.
     * @return The specification
     */
    T everything(boolean shouldPrettyPrint);

    /**
     * Logs only the headers.
     *
     * @return The specification
     */
    T headers();

    /**
     * Logs only the cookies.
     *
     * @return The specification
     */
    T cookies();
}
