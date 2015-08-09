/*
 *  Copyright 2015 LG CNS.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *
 */
package scouter.client.stack.base;

import java.io.File;
import javax.swing.filechooser.FileFilter;

import scouter.client.stack.data.StackParser;

public class StackFileFilter extends FileFilter {	 
	 public StackFileFilter(){
	 }
	 
	public boolean accept(File f) {
		if (f.isDirectory() ) {
			return true;
		}
		
		if(f.getName().endsWith(StackParser.EXTENSION))
			return false;

		if(f.getName().endsWith(StackParser.INFO_EXTENSION))
			return false;
		
		return true;
	} 
	
	public String getDescription() {
		return "Select stack file log"; 
	}
}
