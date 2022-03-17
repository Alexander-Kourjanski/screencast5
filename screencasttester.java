import static org.junit.Assert.*;

import org.junit.*;

public class screencasttester {
    @Test
    public void testsumarg(){
        assertEquals(6, screencast.sumargs(2, 3));
    }
}

//Windows
//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" screencasttester.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore screencasttester

//Linux
//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar screencast.java screencasttester.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore screencasttester


//Login
//ssh cs15lwi22aio@ieng6.ucsd.edu