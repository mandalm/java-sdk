/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.watson.developer_cloud.document_conversion.v1.model;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Structure to store job output
 *
 * @see com.ibm.watson.developer_cloud.document_conversion.v1.DocumentConversion
 */
public class Output extends DocumentConversionModel {

    /**
     * The id of the output
     */
    @Expose
    private String id;
    /**
     * The id of the source document that was used to generated this output
     */
    @Expose
    private String source_document_id;
    /**
     * The date and time the job was created in ISO 8601 date and time format (YYYY-MM-DDTHH:MM:SSZ)
     */
    @Expose
    private String created_on;
    /**
     * The Internet media type of the output
     */
    @Expose
    private String media_type;
    /**
     * A self link to the output itself
     */
    @Expose
    private List<Link> links;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource_document_id() {
        return source_document_id;
    }

    public void setSource_document_id(String source_document_id) {
        this.source_document_id = source_document_id;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
