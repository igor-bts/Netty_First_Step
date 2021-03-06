
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardBeginningDateVariant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardBeginningDateVariant"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *     &lt;enumeration value="BeginningOfThisDay"/&gt;
 *     &lt;enumeration value="BeginningOfThisWeek"/&gt;
 *     &lt;enumeration value="BeginningOfThisTenDays"/&gt;
 *     &lt;enumeration value="BeginningOfThisMonth"/&gt;
 *     &lt;enumeration value="BeginningOfThisQuarter"/&gt;
 *     &lt;enumeration value="BeginningOfThisHalfYear"/&gt;
 *     &lt;enumeration value="BeginningOfThisYear"/&gt;
 *     &lt;enumeration value="BeginningOfLastDay"/&gt;
 *     &lt;enumeration value="BeginningOfLastWeek"/&gt;
 *     &lt;enumeration value="BeginningOfLastTenDays"/&gt;
 *     &lt;enumeration value="BeginningOfLastMonth"/&gt;
 *     &lt;enumeration value="BeginningOfLastQuarter"/&gt;
 *     &lt;enumeration value="BeginningOfLastHalfYear"/&gt;
 *     &lt;enumeration value="BeginningOfLastYear"/&gt;
 *     &lt;enumeration value="BeginningOfNextDay"/&gt;
 *     &lt;enumeration value="BeginningOfNextWeek"/&gt;
 *     &lt;enumeration value="BeginningOfNextTenDays"/&gt;
 *     &lt;enumeration value="BeginningOfNextMonth"/&gt;
 *     &lt;enumeration value="BeginningOfNextQuarter"/&gt;
 *     &lt;enumeration value="BeginningOfNextHalfYear"/&gt;
 *     &lt;enumeration value="BeginningOfNextYear"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandardBeginningDateVariant")
@XmlEnum
public enum StandardBeginningDateVariant {

    @XmlEnumValue("Custom")
    CUSTOM("Custom"),
    @XmlEnumValue("BeginningOfThisDay")
    BEGINNING_OF_THIS_DAY("BeginningOfThisDay"),
    @XmlEnumValue("BeginningOfThisWeek")
    BEGINNING_OF_THIS_WEEK("BeginningOfThisWeek"),
    @XmlEnumValue("BeginningOfThisTenDays")
    BEGINNING_OF_THIS_TEN_DAYS("BeginningOfThisTenDays"),
    @XmlEnumValue("BeginningOfThisMonth")
    BEGINNING_OF_THIS_MONTH("BeginningOfThisMonth"),
    @XmlEnumValue("BeginningOfThisQuarter")
    BEGINNING_OF_THIS_QUARTER("BeginningOfThisQuarter"),
    @XmlEnumValue("BeginningOfThisHalfYear")
    BEGINNING_OF_THIS_HALF_YEAR("BeginningOfThisHalfYear"),
    @XmlEnumValue("BeginningOfThisYear")
    BEGINNING_OF_THIS_YEAR("BeginningOfThisYear"),
    @XmlEnumValue("BeginningOfLastDay")
    BEGINNING_OF_LAST_DAY("BeginningOfLastDay"),
    @XmlEnumValue("BeginningOfLastWeek")
    BEGINNING_OF_LAST_WEEK("BeginningOfLastWeek"),
    @XmlEnumValue("BeginningOfLastTenDays")
    BEGINNING_OF_LAST_TEN_DAYS("BeginningOfLastTenDays"),
    @XmlEnumValue("BeginningOfLastMonth")
    BEGINNING_OF_LAST_MONTH("BeginningOfLastMonth"),
    @XmlEnumValue("BeginningOfLastQuarter")
    BEGINNING_OF_LAST_QUARTER("BeginningOfLastQuarter"),
    @XmlEnumValue("BeginningOfLastHalfYear")
    BEGINNING_OF_LAST_HALF_YEAR("BeginningOfLastHalfYear"),
    @XmlEnumValue("BeginningOfLastYear")
    BEGINNING_OF_LAST_YEAR("BeginningOfLastYear"),
    @XmlEnumValue("BeginningOfNextDay")
    BEGINNING_OF_NEXT_DAY("BeginningOfNextDay"),
    @XmlEnumValue("BeginningOfNextWeek")
    BEGINNING_OF_NEXT_WEEK("BeginningOfNextWeek"),
    @XmlEnumValue("BeginningOfNextTenDays")
    BEGINNING_OF_NEXT_TEN_DAYS("BeginningOfNextTenDays"),
    @XmlEnumValue("BeginningOfNextMonth")
    BEGINNING_OF_NEXT_MONTH("BeginningOfNextMonth"),
    @XmlEnumValue("BeginningOfNextQuarter")
    BEGINNING_OF_NEXT_QUARTER("BeginningOfNextQuarter"),
    @XmlEnumValue("BeginningOfNextHalfYear")
    BEGINNING_OF_NEXT_HALF_YEAR("BeginningOfNextHalfYear"),
    @XmlEnumValue("BeginningOfNextYear")
    BEGINNING_OF_NEXT_YEAR("BeginningOfNextYear");
    private final String value;

    StandardBeginningDateVariant(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardBeginningDateVariant fromValue(String v) {
        for (StandardBeginningDateVariant c: StandardBeginningDateVariant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
