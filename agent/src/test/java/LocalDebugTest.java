import com.taobao.arthas.agent.AttachAgentMain;
import sun.management.VMManagement;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 本机调试
 */
public class LocalDebugTest {

    /**
     * 首先执行./mvnw clean package -DskipTests打包，生成的zip在 packaging/target/ 下面，然后解压。
     * 以debug方式执行此方法，
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws Exception {
        final int pid = getCurrentJVMPid();
        System.out.println("pid:" + pid);
        AttachAgentMain.main(new String[]{"56357"});
        System.out.println("代码植入成功");
        Thread.sleep(10000000);
    }

    /**
     * 获得当前pid
     *
     * @return
     */
    private static int getCurrentJVMPid() {
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();

        try {
            Field jvm = runtime.getClass().getDeclaredField("jvm");
            jvm.setAccessible(true);
            VMManagement mgmt = (VMManagement) jvm.get(runtime);
            Method pid_method = mgmt.getClass().getDeclaredMethod("getProcessId");
            pid_method.setAccessible(true);
            return (int) (Integer) pid_method.invoke(mgmt);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        throw new RuntimeException("Wow!");

    }
}
