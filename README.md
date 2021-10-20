# OLMS
Online Driving License Management System - Team Deekshita
1. Docker [Repo](https://hub.docker.com/r/chandrusharma/license-mgmnt).
2. K8s files
- olms-service.yaml
```
apiVersion: v1
kind: Service
metadata:
  name: olms-service
spec:
  selector:
    app: pod-olms
  type: NodePort
  ports: 
    - port: 8080
      targetPort: 8080
```
- pod-olms.yaml
```
apiVersion: v1
kind: Pod
metadata:
  name: pod-olms
  labels:
    app: pod-olms
spec:
  containers:
    - name: pod-olms
      image: chandrusharma/license-mgmnt:latest
      envFrom:
        - configMapRef:
            name: database-config-olms
```
