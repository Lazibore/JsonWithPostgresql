package com.jdbcPostgreSqlConnection.PostgreSqlConnectionDemo.core.result;

public class SuccessDataResult<T> extends DataResult<T>{

    public SuccessDataResult() {
        super(true, null);
    }
    public SuccessDataResult(T data) {
        super(true, data);
    }
    public SuccessDataResult(String message) {
        super(message, true, null);
    }

    public SuccessDataResult(String message, T data) {
        super(message, true, data);
    }
}
