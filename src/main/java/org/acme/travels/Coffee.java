/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.travels;

public class Coffee {
    private String coffeeType;
    private String creamType;
    private String sugarType;
    private String workStatus;

    @Override
    public String toString() {
        return "{" +
                " coffeeType='" + getCoffeeType() + "'" +
                ", creamType='" + getCreamType() + "'" +
                ", sugarType='" + getSugarType() + "'" +
                ", workStatus='" + getWorkStatus() + "'" +
                "}";
    }

    public Coffee(String coffeeType, String creamType, String sugarType) {
        this.coffeeType = coffeeType;
        this.creamType = creamType;
        this.sugarType = sugarType;
        this.workStatus = "initiated";

    }

    public String getWorkStatus() {
        return this.workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public Coffee workStatus(String workStatus) {
        setWorkStatus(workStatus);
        return this;
    }

    public Coffee() {
    }

    public String getCoffeeType() {
        return this.coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public String getCreamType() {
        return this.creamType;
    }

    public void setCreamType(String creamType) {
        this.creamType = creamType;
    }

    public String getSugarType() {
        return this.sugarType;
    }

    public void setSugarType(String sugarType) {
        this.sugarType = sugarType;
    }

    public Coffee coffeeType(String coffeeType) {
        setCoffeeType(coffeeType);
        return this;
    }

    public Coffee creamType(String creamType) {
        setCreamType(creamType);
        return this;
    }

    public Coffee sugarType(String sugarType) {
        setSugarType(sugarType);
        return this;
    }

}
