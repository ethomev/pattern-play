package com.melville.tom.factory.method;

public class ComEcimNetworkNodeFactory implements NetworkNodeFactory{
    @Override
    public NetworkNode createNode(final String networkElementId, final String neType) {
        NetworkNode networkNode;
        if("DG2".equalsIgnoreCase(neType)){
            networkNode = new Dg2NetworkNode(networkElementId);
        } else if ("MME".equalsIgnoreCase(neType)){
            networkNode = new MmeNetworkNode(networkElementId);
        } else {
            throw new UnsupportedOperationException("NeType not supported, "+neType);
        }
        //TODO Do something platform specific with the node
        return networkNode;
    }
}
