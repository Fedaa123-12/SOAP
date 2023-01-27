/**
 * FilmControllerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package controllers;

public class FilmControllerServiceLocator extends org.apache.axis.client.Service implements controllers.FilmControllerService {

    public FilmControllerServiceLocator() {
    }


    public FilmControllerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FilmControllerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for filmController
    private java.lang.String filmController_address = "http://localhost:8080/SoapService/services/filmController";

    public java.lang.String getfilmControllerAddress() {
        return filmController_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String filmControllerWSDDServiceName = "filmController";

    public java.lang.String getfilmControllerWSDDServiceName() {
        return filmControllerWSDDServiceName;
    }

    public void setfilmControllerWSDDServiceName(java.lang.String name) {
        filmControllerWSDDServiceName = name;
    }

    public controllers.FilmController getfilmController() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(filmController_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getfilmController(endpoint);
    }

    public controllers.FilmController getfilmController(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            controllers.FilmControllerSoapBindingStub _stub = new controllers.FilmControllerSoapBindingStub(portAddress, this);
            _stub.setPortName(getfilmControllerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setfilmControllerEndpointAddress(java.lang.String address) {
        filmController_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (controllers.FilmController.class.isAssignableFrom(serviceEndpointInterface)) {
                controllers.FilmControllerSoapBindingStub _stub = new controllers.FilmControllerSoapBindingStub(new java.net.URL(filmController_address), this);
                _stub.setPortName(getfilmControllerWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("filmController".equals(inputPortName)) {
            return getfilmController();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controllers", "filmControllerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controllers", "filmController"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("filmController".equals(portName)) {
            setfilmControllerEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
