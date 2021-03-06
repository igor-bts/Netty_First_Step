
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardPeriodVariant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardPeriodVariant"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *     &lt;enumeration value="Today"/&gt;
 *     &lt;enumeration value="ThisWeek"/&gt;
 *     &lt;enumeration value="ThisTenDays"/&gt;
 *     &lt;enumeration value="ThisMonth"/&gt;
 *     &lt;enumeration value="ThisQuarter"/&gt;
 *     &lt;enumeration value="ThisHalfYear"/&gt;
 *     &lt;enumeration value="ThisYear"/&gt;
 *     &lt;enumeration value="FromBeginningOfThisWeek"/&gt;
 *     &lt;enumeration value="FromBeginningOfThisTenDays"/&gt;
 *     &lt;enumeration value="FromBeginningOfThisMonth"/&gt;
 *     &lt;enumeration value="FromBeginningOfThisQuarter"/&gt;
 *     &lt;enumeration value="FromBeginningOfThisHalfYear"/&gt;
 *     &lt;enumeration value="FromBeginningOfThisYear"/&gt;
 *     &lt;enumeration value="Yesterday"/&gt;
 *     &lt;enumeration value="LastWeek"/&gt;
 *     &lt;enumeration value="LastTenDays"/&gt;
 *     &lt;enumeration value="LastMonth"/&gt;
 *     &lt;enumeration value="LastQuarter"/&gt;
 *     &lt;enumeration value="LastHalfYear"/&gt;
 *     &lt;enumeration value="LastYear"/&gt;
 *     &lt;enumeration value="LastWeekTillSameWeekDay"/&gt;
 *     &lt;enumeration value="LastTenDaysTillSameDayNumber"/&gt;
 *     &lt;enumeration value="LastMonthTillSameDate"/&gt;
 *     &lt;enumeration value="LastQuarterTillSameDate"/&gt;
 *     &lt;enumeration value="LastHalfYearTillSameDate"/&gt;
 *     &lt;enumeration value="LastYearTillSameDate"/&gt;
 *     &lt;enumeration value="Tomorrow"/&gt;
 *     &lt;enumeration value="NextWeek"/&gt;
 *     &lt;enumeration value="NextTenDays"/&gt;
 *     &lt;enumeration value="NextMonth"/&gt;
 *     &lt;enumeration value="NextQuarter"/&gt;
 *     &lt;enumeration value="NextHalfYear"/&gt;
 *     &lt;enumeration value="NextYear"/&gt;
 *     &lt;enumeration value="NextWeekTillSameWeekDay"/&gt;
 *     &lt;enumeration value="NextTenDaysTillSameDayNumber"/&gt;
 *     &lt;enumeration value="NextMonthTillSameDate"/&gt;
 *     &lt;enumeration value="NextQuarterTillSameDate"/&gt;
 *     &lt;enumeration value="NextHalfYearTillSameDate"/&gt;
 *     &lt;enumeration value="NextYearTillSameDate"/&gt;
 *     &lt;enumeration value="TillEndOfThisWeek"/&gt;
 *     &lt;enumeration value="TillEndOfThisTenDays"/&gt;
 *     &lt;enumeration value="TillEndOfThisMonth"/&gt;
 *     &lt;enumeration value="TillEndOfThisQuarter"/&gt;
 *     &lt;enumeration value="TillEndOfThisHalfYear"/&gt;
 *     &lt;enumeration value="TillEndOfThisYear"/&gt;
 *     &lt;enumeration value="Last7Days"/&gt;
 *     &lt;enumeration value="Next7Days"/&gt;
 *     &lt;enumeration value="Month"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandardPeriodVariant")
@XmlEnum
public enum StandardPeriodVariant {

    @XmlEnumValue("Custom")
    CUSTOM("Custom"),
    @XmlEnumValue("Today")
    TODAY("Today"),
    @XmlEnumValue("ThisWeek")
    THIS_WEEK("ThisWeek"),
    @XmlEnumValue("ThisTenDays")
    THIS_TEN_DAYS("ThisTenDays"),
    @XmlEnumValue("ThisMonth")
    THIS_MONTH("ThisMonth"),
    @XmlEnumValue("ThisQuarter")
    THIS_QUARTER("ThisQuarter"),
    @XmlEnumValue("ThisHalfYear")
    THIS_HALF_YEAR("ThisHalfYear"),
    @XmlEnumValue("ThisYear")
    THIS_YEAR("ThisYear"),
    @XmlEnumValue("FromBeginningOfThisWeek")
    FROM_BEGINNING_OF_THIS_WEEK("FromBeginningOfThisWeek"),
    @XmlEnumValue("FromBeginningOfThisTenDays")
    FROM_BEGINNING_OF_THIS_TEN_DAYS("FromBeginningOfThisTenDays"),
    @XmlEnumValue("FromBeginningOfThisMonth")
    FROM_BEGINNING_OF_THIS_MONTH("FromBeginningOfThisMonth"),
    @XmlEnumValue("FromBeginningOfThisQuarter")
    FROM_BEGINNING_OF_THIS_QUARTER("FromBeginningOfThisQuarter"),
    @XmlEnumValue("FromBeginningOfThisHalfYear")
    FROM_BEGINNING_OF_THIS_HALF_YEAR("FromBeginningOfThisHalfYear"),
    @XmlEnumValue("FromBeginningOfThisYear")
    FROM_BEGINNING_OF_THIS_YEAR("FromBeginningOfThisYear"),
    @XmlEnumValue("Yesterday")
    YESTERDAY("Yesterday"),
    @XmlEnumValue("LastWeek")
    LAST_WEEK("LastWeek"),
    @XmlEnumValue("LastTenDays")
    LAST_TEN_DAYS("LastTenDays"),
    @XmlEnumValue("LastMonth")
    LAST_MONTH("LastMonth"),
    @XmlEnumValue("LastQuarter")
    LAST_QUARTER("LastQuarter"),
    @XmlEnumValue("LastHalfYear")
    LAST_HALF_YEAR("LastHalfYear"),
    @XmlEnumValue("LastYear")
    LAST_YEAR("LastYear"),
    @XmlEnumValue("LastWeekTillSameWeekDay")
    LAST_WEEK_TILL_SAME_WEEK_DAY("LastWeekTillSameWeekDay"),
    @XmlEnumValue("LastTenDaysTillSameDayNumber")
    LAST_TEN_DAYS_TILL_SAME_DAY_NUMBER("LastTenDaysTillSameDayNumber"),
    @XmlEnumValue("LastMonthTillSameDate")
    LAST_MONTH_TILL_SAME_DATE("LastMonthTillSameDate"),
    @XmlEnumValue("LastQuarterTillSameDate")
    LAST_QUARTER_TILL_SAME_DATE("LastQuarterTillSameDate"),
    @XmlEnumValue("LastHalfYearTillSameDate")
    LAST_HALF_YEAR_TILL_SAME_DATE("LastHalfYearTillSameDate"),
    @XmlEnumValue("LastYearTillSameDate")
    LAST_YEAR_TILL_SAME_DATE("LastYearTillSameDate"),
    @XmlEnumValue("Tomorrow")
    TOMORROW("Tomorrow"),
    @XmlEnumValue("NextWeek")
    NEXT_WEEK("NextWeek"),
    @XmlEnumValue("NextTenDays")
    NEXT_TEN_DAYS("NextTenDays"),
    @XmlEnumValue("NextMonth")
    NEXT_MONTH("NextMonth"),
    @XmlEnumValue("NextQuarter")
    NEXT_QUARTER("NextQuarter"),
    @XmlEnumValue("NextHalfYear")
    NEXT_HALF_YEAR("NextHalfYear"),
    @XmlEnumValue("NextYear")
    NEXT_YEAR("NextYear"),
    @XmlEnumValue("NextWeekTillSameWeekDay")
    NEXT_WEEK_TILL_SAME_WEEK_DAY("NextWeekTillSameWeekDay"),
    @XmlEnumValue("NextTenDaysTillSameDayNumber")
    NEXT_TEN_DAYS_TILL_SAME_DAY_NUMBER("NextTenDaysTillSameDayNumber"),
    @XmlEnumValue("NextMonthTillSameDate")
    NEXT_MONTH_TILL_SAME_DATE("NextMonthTillSameDate"),
    @XmlEnumValue("NextQuarterTillSameDate")
    NEXT_QUARTER_TILL_SAME_DATE("NextQuarterTillSameDate"),
    @XmlEnumValue("NextHalfYearTillSameDate")
    NEXT_HALF_YEAR_TILL_SAME_DATE("NextHalfYearTillSameDate"),
    @XmlEnumValue("NextYearTillSameDate")
    NEXT_YEAR_TILL_SAME_DATE("NextYearTillSameDate"),
    @XmlEnumValue("TillEndOfThisWeek")
    TILL_END_OF_THIS_WEEK("TillEndOfThisWeek"),
    @XmlEnumValue("TillEndOfThisTenDays")
    TILL_END_OF_THIS_TEN_DAYS("TillEndOfThisTenDays"),
    @XmlEnumValue("TillEndOfThisMonth")
    TILL_END_OF_THIS_MONTH("TillEndOfThisMonth"),
    @XmlEnumValue("TillEndOfThisQuarter")
    TILL_END_OF_THIS_QUARTER("TillEndOfThisQuarter"),
    @XmlEnumValue("TillEndOfThisHalfYear")
    TILL_END_OF_THIS_HALF_YEAR("TillEndOfThisHalfYear"),
    @XmlEnumValue("TillEndOfThisYear")
    TILL_END_OF_THIS_YEAR("TillEndOfThisYear"),
    @XmlEnumValue("Last7Days")
    LAST_7_DAYS("Last7Days"),
    @XmlEnumValue("Next7Days")
    NEXT_7_DAYS("Next7Days"),
    @XmlEnumValue("Month")
    MONTH("Month");
    private final String value;

    StandardPeriodVariant(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardPeriodVariant fromValue(String v) {
        for (StandardPeriodVariant c: StandardPeriodVariant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
