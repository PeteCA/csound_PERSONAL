/* 
 
CsoundHaikuIVActivity.java:
 
 Copyright (C) 2011 Victor Lazzarini, Steven Yi
 
 This file is part of Csound Android Examples.
 
 The Csound Android Examples is free software; you can redistribute it
 and/or modify it under the terms of the GNU Lesser General Public
 License as published by the Free Software Foundation; either
 version 2.1 of the License, or (at your option) any later version.   
 
 Csound is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Lesser General Public License for more details.
 
 You should have received a copy of the GNU Lesser General Public
 License along with Csound; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
 02111-1307 USA
 
 */

package com.csounds.tests;

import java.io.File;

import android.os.Bundle;

import com.csounds.BaseCsoundActivity;
import com.csounds.R;

public class CsoundHaikuIVActivity extends BaseCsoundActivity {


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.csound_haiku_iv);

		String csd = getResourceFileAsString(R.raw.iv);
		File f = createTempFile(csd);
		csoundObj.setMessageLoggingEnabled(true);
		csoundObj.startCsound(f);
		
	}

}