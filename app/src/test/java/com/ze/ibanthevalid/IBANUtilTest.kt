/*
 * Copyright 2017-2018 Simon Zigelli
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ze.ibanthevalid

import org.hamcrest.CoreMatchers.`is`
import org.junit.Test

import org.junit.Assert.*

class IBANUtilTest {

    @Test
    fun testValidIBAN() {
        assertThat(IBANUtil.check("DE68210501700012345678"), `is`(true))
        assertThat(IBANUtil.check("de68210501700012345678"), `is`(true))
        assertThat(IBANUtil.check("dé68210501700012345678"), `is`(false))
        assertThat(IBANUtil.check("DEE1111111111111111111"), `is`(false))
        assertThat(IBANUtil.check("DE11111111111111111111"), `is`(false))
        assertThat(IBANUtil.check("DE111111111111111111"), `is`(false))
        assertThat(IBANUtil.check("DE11111111111111111111333"), `is`(false))

        assertThat(IBANUtil.check("AL47212110090000000235698741"), `is`(true))
        assertThat(IBANUtil.check("AD1200012030200359100100"), `is`(true))
        assertThat(IBANUtil.check("AT611904300234573201"), `is`(true))
        assertThat(IBANUtil.check("AZ21NABZ00000000137010001944"), `is`(true))
        assertThat(IBANUtil.check("BH67BMAG00001299123456"), `is`(true))
        assertThat(IBANUtil.check("BE62510007547061"), `is`(true))
        assertThat(IBANUtil.check("BA391290079401028494"), `is`(true))
        assertThat(IBANUtil.check("BG80BNBG96611020345678"), `is`(true))
        assertThat(IBANUtil.check("HR1210010051863000160"), `is`(true))
        assertThat(IBANUtil.check("CY17002001280000001200527600"), `is`(true))
        assertThat(IBANUtil.check("CZ6508000000192000145399"), `is`(true))
        assertThat(IBANUtil.check("DK5000400440116243"), `is`(true))
        assertThat(IBANUtil.check("EE382200221020145685"), `is`(true))
        assertThat(IBANUtil.check("FO9754320388899944"), `is`(true))
        assertThat(IBANUtil.check("FI2112345600000785"), `is`(true))
        assertThat(IBANUtil.check("FR1420041010050500013M02606"), `is`(true))
        assertThat(IBANUtil.check("GE29NB0000000101904917"), `is`(true))
        assertThat(IBANUtil.check("DE89370400440532013000"), `is`(true))
        assertThat(IBANUtil.check("GI75NWBK000000007099453"), `is`(true))
        assertThat(IBANUtil.check("GR1601101250000000012300695"), `is`(true))
        assertThat(IBANUtil.check("GL5604449876543210"), `is`(true))
        assertThat(IBANUtil.check("HU42117730161111101800000000"), `is`(true))
        assertThat(IBANUtil.check("IS140159260076545510730339"), `is`(true))
        assertThat(IBANUtil.check("IE29AIBK93115212345678"), `is`(true))
        assertThat(IBANUtil.check("IL620108000000099999999"), `is`(true))
        assertThat(IBANUtil.check("IT40S0542811101000000123456"), `is`(true))
        assertThat(IBANUtil.check("JO94CBJO0010000000000131000302"), `is`(true))
        assertThat(IBANUtil.check("KW81CBKU0000000000001234560101"), `is`(true))
        assertThat(IBANUtil.check("LV80BANK0000435195001"), `is`(true))
        assertThat(IBANUtil.check("LB62099900000001001901229114"), `is`(true))
        assertThat(IBANUtil.check("LI21088100002324013AA"), `is`(true))
        assertThat(IBANUtil.check("LT121000011101001000"), `is`(true))
        assertThat(IBANUtil.check("LU280019400644750000"), `is`(true))
        assertThat(IBANUtil.check("MK07250120000058984"), `is`(true))
        assertThat(IBANUtil.check("MT84MALT011000012345MTLCAST001S"), `is`(true))
        assertThat(IBANUtil.check("MU17BOMM0101101030300200000MUR"), `is`(true))
        assertThat(IBANUtil.check("MD24AG000225100013104168"), `is`(true))
        assertThat(IBANUtil.check("MC9320052222100112233M44555"), `is`(true))
        assertThat(IBANUtil.check("ME25505000012345678951"), `is`(true))
        assertThat(IBANUtil.check("NL39RABO0300065264"), `is`(true))
        assertThat(IBANUtil.check("NO9386011117947"), `is`(true))
        assertThat(IBANUtil.check("PK36SCBL0000001123456702"), `is`(true))
        assertThat(IBANUtil.check("PL60102010260000042270201111"), `is`(true))
        assertThat(IBANUtil.check("PT50000201231234567890154"), `is`(true))
        assertThat(IBANUtil.check("QA58DOHB00001234567890ABCDEFG"), `is`(true))
        assertThat(IBANUtil.check("RO49AAAA1B31007593840000"), `is`(true))
        assertThat(IBANUtil.check("SM86U0322509800000000270100"), `is`(true))
        assertThat(IBANUtil.check("SA0380000000608010167519"), `is`(true))
        assertThat(IBANUtil.check("RS35260005601001611379"), `is`(true))
        assertThat(IBANUtil.check("SK3112000000198742637541"), `is`(true))
        assertThat(IBANUtil.check("SI56191000000123438"), `is`(true))
        assertThat(IBANUtil.check("ES8023100001180000012345"), `is`(true))
        assertThat(IBANUtil.check("SE3550000000054910000003"), `is`(true))
        assertThat(IBANUtil.check("CH9300762011623852957"), `is`(true))
        assertThat(IBANUtil.check("TN5910006035183598478831"), `is`(true))
        assertThat(IBANUtil.check("TR330006100519786457841326"), `is`(true))
        assertThat(IBANUtil.check("AE070331234567890123456"), `is`(true))
        assertThat(IBANUtil.check("GB87BARC20658244971655"), `is`(true))
    }
}
