package com.range.stcfactor.expression.tree;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 函数信息
 *
 * @author renjie.zhu@woqutech.com
 * @create 2019-08-05
 */
public class ExpModel implements Cloneable {

    private static final Logger logger = LogManager.getLogger(ExpModel.class);

    private String modelName;
    private Class[] parametersType;
    private Class returnType;

    public ExpModel() {

    }

    public ExpModel(String modelName, Class[] parametersType, Class returnType) {
        this.modelName = modelName;
        this.parametersType = parametersType;
        this.returnType = returnType;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Class[] getParametersType() {
        return parametersType;
    }

    public void setParametersType(Class[] parametersType) {
        this.parametersType = parametersType;
    }

    public Class getReturnType() {
        return returnType;
    }

    public void setReturnType(Class returnType) {
        this.returnType = returnType;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        ExpModel expModel = (ExpModel) obj;
        if (this.modelName.equals(expModel.getModelName())
            && this.parametersType.length == expModel.parametersType.length) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.modelName;
    }

    @Override
    public Object clone() {
        ExpModel model = null;
        try {
            model = (ExpModel) super.clone();
        } catch (CloneNotSupportedException e) {
            logger.error("ExpModel clone error.", e);
        }
        return model;
    }

}
