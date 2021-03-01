package event;

import task.WorkTask;
import thread.WorkThread;

public abstract class AbstractEvent {   
    protected WorkThread workthread;   
    protected Thread nowthread;   
    protected WorkTask nowtask;   
    //事件触发   
    public synchronized void execute(){};   
    @Override  
    public boolean equals(Object obj) {   
        // TODO Auto-generated method stub   
        AbstractEvent other=(AbstractEvent)obj;   
        return this.workthread==other.workthread&&this.nowtask==this.nowtask;   
    };   
       
}  
