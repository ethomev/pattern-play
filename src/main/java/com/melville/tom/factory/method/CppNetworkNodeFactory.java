package com.melville.tom.factory.method;

public class CppNetworkNodeFactory implements NetworkNodeFactory {
    @Override
    public NetworkNode createNode(final String networkElementId, final String neType) {
        NetworkNode networkNode;
        if("ERBS".equalsIgnoreCase(neType)){
            networkNode = new ErbsNetworkNode(networkElementId);
        } else if("RNC".equalsIgnoreCase(neType)){
            networkNode = new RncNetworkNode(networkElementId);
        } else {
            throw new UnsupportedOperationException("NeType not supported, "+neType);
        }
        //TODO Do something platform specific with the node
        return networkNode;
    }
}
