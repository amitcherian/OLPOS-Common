package jpos.profile;

///////////////////////////////////////////////////////////////////////////////
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED 
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives. Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted. 
//
///////////////////////////////////////////////////////////////////////////////

import junit.framework.*;

/**
 * A TestSuite that puts together all the test classes from the JCL packages
 * @author E. Michael Maximilien (maxim@us.ibm.com)
 */
public class AllTests extends TestSuite
{
	//-------------------------------------------------------------------------
	// Public class methods
	//

	public static TestSuite suite()
	{
		TestSuite suite = new AllTests();

		suite.addTest( new TestSuite( PropInfoListTestCase.class ) );
		suite.addTest( new TestSuite( DevCatInfoListTestCase.class ) );
		suite.addTest( new TestSuite( PropValueListTestCase.class ) );
		suite.addTest( new TestSuite( PropValueTestCase.class ) );
		suite.addTest( new TestSuite( ProfileRegistryTestCase.class ) );
		suite.addTest( new TestSuite( XercesProfileFactoryTestCase.class ) );

		return suite;
	}
}