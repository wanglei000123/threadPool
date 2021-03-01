package task;

import java.util.ArrayList;   
import java.util.List;   
  
public class TaskManager {   
    private  static List taskQueue=new ArrayList<WorkTask>(); //任务队列    
    private TaskManager(){   
           
    }   
    //添加任务                                               
    public synchronized static  void addTask(WorkTask task){   
        taskQueue.add(task);   
    }   
    //判断是否有任务未执行   
    public synchronized static WorkTask getWorkTask(){   
        if (taskQueue.size()>0){   
            return (WorkTask)taskQueue.remove(0);   
        }else  
            return null;   
    }   
} 
