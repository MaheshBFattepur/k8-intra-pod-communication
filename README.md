# k8-intra-pod-communication
2 Spring boot applications communicate with localhost in same POD

# Steps for execution
kubectl create -f manifest/deployment.yaml
kubectl create -f manifests/service.yaml

# Verify 
1.
```
kubectl get pods -o wide

NAME                                                READY   STATUS    RESTARTS   AGE
k8-intra-pod-communication-deploy-8bd968cd5-vtd4g   2/2     Running   0          19s
```
2. 
```
kubectl get svc

NAME                                 TYPE        CLUSTER-IP      EXTERNAL-IP   PORT(S)                         AGE
k8-intra-pod-communication-service   NodePort    10.101.128.62   <none>        8080:30030/TCP,9090:30040/TCP   12m
kubernetes                           ClusterIP   10.96.0.1       <none>        443/TCP                         6d17h
```
3. Open browser and execute http://MASTER-IP:30030/sserver/sayhello
```
O/P: 
Connection established -> [Server: Start, Node: node1.com] Server says hello!!! -> [Server: End, Node: node2.com] Server acknowledge to hello!!! -> Connection closed
```
