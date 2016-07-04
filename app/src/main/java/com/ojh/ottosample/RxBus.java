package com.ojh.ottosample;

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

public class RxBus {

    private static final Subject<Object, Object> BUS = new SerializedSubject<>(PublishSubject.create());

    public static void send(Object o) {
        BUS.onNext(o);
    }

    public static Observable<Object> toObserverable() {
        return BUS;
    }
}