package com.ucar.streamsuite.engine.po;

import java.io.Serializable;
import java.util.Date;


/**
 * Description: 引擎spark执行的过程实例信息
 * Created on 2018/1/18 下午4:33
 *
 *
 */
public class SparkProcessPO implements Serializable {

    private static final long serialVersionUID = -5729044331250315761L;

    /**
     * id（自增id）
     */
    private Integer id;

    /**
     *  任务ID
     */
    private Integer taskId;

    /**
     * 任务开始时间
     */
    private Date startTime;

    /**
     * yarn环境上产生的APPID
     */
    private String yarnAppId;

    /**
     * 提交日志信息
     */
    private String logMessage;

    /**
     * 任务配置信息(json格式存储)
     */
    private String taskConfig;

    /**
     * 任务的提交结果
     */
    private Integer submitResult;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getYarnAppId() {
        return yarnAppId;
    }

    public void setYarnAppId(String yarnAppId) {
        this.yarnAppId = yarnAppId;
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }

    public String getTaskConfig() {
        return taskConfig;
    }

    public void setTaskConfig(String taskConfig) {
        this.taskConfig = taskConfig;
    }

    public Integer getSubmitResult() {
        return submitResult;
    }

    public void setSubmitResult(Integer submitResult) {
        this.submitResult = submitResult;
    }
}
