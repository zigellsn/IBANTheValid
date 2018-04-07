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

import java.math.BigInteger

object IBANUtil {
    fun check(iban: String): Boolean {
        if (iban.length <= 4)
            return false
        if (!checkLength(iban))
            return false
        val translatedIban = translateLetters(iban)

        val numberSlice = translatedIban.slice(6..(translatedIban.length - 1))
        val checkSum = translatedIban.slice(0..5)

        val checkString = "$numberSlice$checkSum"
        val intValue = checkString.toBigIntegerOrNull()
        return if (intValue == null)
            false
        else {
            (intValue.rem(BigInteger.valueOf(97))) == BigInteger.valueOf(1)
        }
    }

    private fun translateLetters(iban: String): String {
        var translatedIban = iban.toUpperCase()
        iban.toUpperCase().filter{ (it.toInt() - 55) in 10..35 }.forEach {
            translatedIban = translatedIban.replace(it.toString(), digit(it), true)
        }
        return translatedIban
    }

    private fun checkLength(iban: String): Boolean {
        return when(iban.slice(0..1).toUpperCase()) {
            "EG" -> return iban.length == 27
            "AL" -> return iban.length == 28
            "DZ" -> return iban.length == 24
            "AD" -> return iban.length == 24
            "AO" -> return iban.length == 25
            "AZ" -> return iban.length == 28
            "BH" -> return iban.length == 22
            "BE" -> return iban.length == 16
            "BJ" -> return iban.length == 28
            "BA" -> return iban.length == 20
            "BR" -> return iban.length == 29
            "VG" -> return iban.length == 24
            "BG" -> return iban.length == 22
            "BF" -> return iban.length == 27
            "BI" -> return iban.length == 16
            "CR" -> return iban.length == 22
            "CI" -> return iban.length == 28
            "DK" -> return iban.length == 18
            "DE" -> return iban.length == 22
            "DO" -> return iban.length == 28
            "SV" -> return iban.length == 28
            "EE" -> return iban.length == 20
            "FO" -> return iban.length == 18
            "FI" -> return iban.length == 18
            "FR" -> return iban.length == 27
            "GA" -> return iban.length == 27
            "GE" -> return iban.length == 22
            "GI" -> return iban.length == 23
            "GR" -> return iban.length == 27
            "GL" -> return iban.length == 18
            "GT" -> return iban.length == 28
            "IQ" -> return iban.length == 23
            "IR" -> return iban.length == 26
            "IE" -> return iban.length == 22
            "IS" -> return iban.length == 26
            "IL" -> return iban.length == 23
            "IT" -> return iban.length == 27
            "JO" -> return iban.length == 30
            "CM" -> return iban.length == 27
            "CV" -> return iban.length == 25
            "KZ" -> return iban.length == 20
            "QA" -> return iban.length == 29
            "CG" -> return iban.length == 27
            "XK" -> return iban.length == 20
            "HR" -> return iban.length == 21
            "KW" -> return iban.length == 30
            "LV" -> return iban.length == 21
            "LB" -> return iban.length == 28
            "LI" -> return iban.length == 21
            "LT" -> return iban.length == 20
            "LU" -> return iban.length == 20
            "MG" -> return iban.length == 27
            "ML" -> return iban.length == 28
            "MT" -> return iban.length == 31
            "MR" -> return iban.length == 27
            "MU" -> return iban.length == 30
            "MK" -> return iban.length == 19
            "MD" -> return iban.length == 24
            "MC" -> return iban.length == 27
            "ME" -> return iban.length == 22
            "MZ" -> return iban.length == 25
            "NL" -> return iban.length == 18
            "NO" -> return iban.length == 15
            "AT" -> return iban.length == 20
            "TL" -> return iban.length == 23
            "PK" -> return iban.length == 24
            "PS" -> return iban.length == 29
            "PL" -> return iban.length == 28
            "PT" -> return iban.length == 25
            "RO" -> return iban.length == 24
            "SM" -> return iban.length == 27
            "ST" -> return iban.length == 25
            "SA" -> return iban.length == 24
            "SE" -> return iban.length == 24
            "CH" -> return iban.length == 21
            "SN" -> return iban.length == 28
            "RS" -> return iban.length == 22
            "SC" -> return iban.length == 31
            "SK" -> return iban.length == 24
            "SI" -> return iban.length == 19
            "ES" -> return iban.length == 24
            "LC" -> return iban.length == 32
            "CZ" -> return iban.length == 24
            "TN" -> return iban.length == 24
            "TR" -> return iban.length == 26
            "UA" -> return iban.length == 29
            "HU" -> return iban.length == 28
            "AE" -> return iban.length == 23
            "GB" -> return iban.length == 22
            "BY" -> return iban.length == 28
            "CY" -> return iban.length == 28
            "CF" -> return iban.length == 27
            else -> false
        }
    }

    private fun digit(char: Char): String {
        val i = char.toInt() - 55
        return if (i in 10..35) {
            i.toString()
        } else {
            ""
        }
    }
}