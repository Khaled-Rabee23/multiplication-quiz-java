JAVAC ?= javac
JAVA ?= java
BUILD_DIR := build
SOURCES := $(wildcard src/*.java)

.PHONY: all run run-v1 run-v2 run-v3 clean

all:
	mkdir -p $(BUILD_DIR)
	$(JAVAC) -d $(BUILD_DIR) $(SOURCES)

run: all
	$(JAVA) -cp $(BUILD_DIR) App

run-v1: all
	$(JAVA) -cp $(BUILD_DIR) MultiplyTest_1

run-v2: all
	$(JAVA) -cp $(BUILD_DIR) MultiplyTest_2

run-v3: all
	$(JAVA) -cp $(BUILD_DIR) MultiplyTest_3

clean:
	rm -rf $(BUILD_DIR)
