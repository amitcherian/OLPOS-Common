/*
 * Copyright (C) 2001 Linux Developers Group
 * <http://www.linuxdevel.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package com.globalretailtech.data;

import com.globalretailtech.data.CommonDBContext;

/**
 *
 * @author  James LewisMoss
 */
public class InterbaseDBContext
        extends CommonDBContext {
    public String generateFunctionCall(String funcName, Object[] args) {
        StringBuffer tmp = new StringBuffer();

        tmp.append("execute procedure ");
        tmp.append(funcName);
        tmp.append(" ");
        tmp.append(genStringSeparatedString(args, ", "));
        tmp.append(" ;");

        return tmp.toString();

    }

}

