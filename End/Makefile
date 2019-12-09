VERSION	?= latest
APP		?= k8-end-service
IMAGE	?= fathepurm/$(APP):$(VERSION)

.PHONY: build

all: build push

build:

	docker build -t $(IMAGE) .

run:

	docker run -p 9090:9090 $(IMAGE)

push:

	docker push $(IMAGE)
