#! /usr/bin/env python
# -*- coding:utf-8 -*-


import os


if __name__ == '__main__':
    
    for jdk_version in range(8, 11):
        
        image = 'openjdk:{0}'.format(jdk_version)
        command = 'java/execute.sh'
        docker = 'docker run --rm -v $(pwd):/java -it {0} sh {1}'.format(image, command)
        
        print docker
        os.system(docker)

