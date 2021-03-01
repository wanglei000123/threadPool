package event;

import task.WorkTask;   
import thread.ThreadPool;   
import thread.WorkThread;   
  
public class TaskTimeOutEvent  {   
    private AbstractEvent event;   
    public TaskTimeOutEvent(AbstractEvent event){   
        this.event=event;   
    }   
  
  
    @SuppressWarnings("deprecation")   
    public  void execute() {   
        // TODO Auto-generated method stub   
        ThreadPool pool=ThreadPool.getInstance();   
        pool.addWorkThread();   
        pool.removeWorkThread(event.workthread);   
        Object obj=event.workthread.getThreadKey();   
        System.out.println("正在停止工作超时线程...线程编号"+obj);   
        event.nowthread.stop();   
           
    }   
  
} 
