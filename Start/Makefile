VERSION	?= latest
APP		?= k8-start-service
IMAGE	?= fathepurm/$(APP):$(VERSION)

.PHONY: build

all: build push

build:

	docker build -t $(IMAGE) .

run:

	docker run -p 8080:8080 $(IMAGE)

push:

	docker push $(IMAGE)
