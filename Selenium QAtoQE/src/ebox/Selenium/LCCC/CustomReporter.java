package ebox.Selenium.LCCC;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlSuite;

public class CustomReporter implements IReporter {

    @Override

    public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1,

            String outputDirectory) {

        // Second parameter of this method ISuite will contain all the suite executed.

        for (ISuite iSuite : arg1) {

         //Get a map of result of a single suite at a time

            Map<String,ISuiteResult> results =    iSuite.getResults();

         //Get the key of the result map

            Set<String> keys = results.keySet();

        //Go to each map value one by one

            for (String key : keys) {

             //The Context object of current result

            ITestContext context = results.get(key).getTestContext();

            //Print Suite detail in Console

             System.out.println("Suite Name->"+context.getName()

                    + "\nReport output Ditectory->"+context.getOutputDirectory()

                     +"\nSuite Name->"+ context.getSuite().getName()

                     +"\nStart Date Time for execution->"+context.getStartDate()

                     +"\nEnd Date Time for execution->"+context.getEndDate());

             
             //Get Map for only passed test cases

            IResultMap passedtests = context.getPassedTests();

            //Get method detail of passed test cases

            Collection<ITestNGMethod> PassedMethods = passedtests.getAllMethods();

            //Loop one by one in all passed methods

            //System.out.println("--------PASSED TEST CASE---------");

            for (ITestNGMethod iTestNGMethod : PassedMethods) {

                //Print Passed test cases detail

                System.out.println("PASSED: "+iTestNGMethod.getMethodName());

                        //+"\nThis test case will add the address book details");

                        //+"\nPriority->"+iTestNGMethod.getPriority()

                        //+"\n:Date->"+new Date(iTestNGMethod.getDate()));

                

            }
            
            //Get Map for only failed test cases

            IResultMap failedtests = context.getFailedTests();

            //Get method detail of failed test cases

            Collection<ITestNGMethod> FaileddMethods = failedtests.getAllMethods();

            //Loop one by one in all failed methods

            //System.out.println("--------PASSED TEST CASE---------");

            for (ITestNGMethod iTestNGMethod : FaileddMethods) {

                //Print failed test cases detail

                System.out.println("FAILED:"+iTestNGMethod.getMethodName());

                        //+"\nThis test case will add the address book details");

                        //+"\nPriority->"+iTestNGMethod.getPriority()

                        //+"\n:Date->"+new Date(iTestNGMethod.getDate()));

                

            }

        }

        }

        

    }

}