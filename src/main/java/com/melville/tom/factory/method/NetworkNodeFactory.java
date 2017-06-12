package com.melville.tom.factory.method;


public interface NetworkNodeFactory {
    NetworkNode createNode(String networkElementId, String neType);
}
