package com.training.samples;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith (Suite.class)
@SuiteClasses(value = {PerfectNumberTest.class, TestPerfectNumberByParameter.class})
public class MyTestSuite {

}
