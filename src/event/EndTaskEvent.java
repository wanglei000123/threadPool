package event;

import task.WorkTask;   
import thread.ThreadPool;   
import thread.WorkThread;   
  
public class EndTaskEvent extends AbstractEvent {   
    public EndTaskEvent(WorkThread workthread,Thread nowthread,WorkTask task){   
        this.workthread=workthread;   
        this.nowthread=nowthread;   
        this.nowtask=task;   
    }   
  
    @Override  
    public  void execute() {   
        // TODO Auto-generated method stub   
        ThreadPool pool=ThreadPool.getInstance();   
        pool.endTaskRun(this);   
    }   
       
}   
