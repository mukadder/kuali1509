/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2015 Kuali, Inc.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.kuali.kra.bo;


import org.kuali.coeus.sys.framework.model.KcPersistableBusinessObjectBase;

/**
 * 
 * This class is for risk level code maintenance.
 */
public class RiskLevel extends KcPersistableBusinessObjectBase {

    private String riskLevelCode;

    private String description;

    public RiskLevel() {
    }

    public String getRiskLevelCode() {
        return riskLevelCode;
    }

    public void setRiskLevelCode(String riskLevelCode) {
        this.riskLevelCode = riskLevelCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((riskLevelCode == null) ? 0 : riskLevelCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final RiskLevel other = (RiskLevel) obj;
        if (description == null) {
            if (other.description != null) return false;
        } else if (!description.equals(other.description)) return false;
        if (riskLevelCode == null) {
            if (other.riskLevelCode != null) return false;
        } else if (!riskLevelCode.equals(other.riskLevelCode)) return false;
        return true;
    }
}
