package task;

public interface WorkTask {   
    void execute() throws Exception; //执行工作任务   
    void setTaskThreadKey(Object key);//设置任务线程编号   
}   
