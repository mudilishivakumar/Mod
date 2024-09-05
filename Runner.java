package runner;

import base.BaseClass;
import pages.Login;

import java.time.Duration;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        BaseClass bi =new BaseClass();
        Login Li=new Login();
        bi.setup();
Thread.sleep(3000);
        Li.sigin();
        Thread.sleep(3000);

        Li.username();
        Li.password();
        Li.lgButton();
    }
}
