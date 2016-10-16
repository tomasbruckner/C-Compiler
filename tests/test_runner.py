#!/usr/bin/env python

import argparse
import glob
import re
import subprocess

# Path to the JAR file
# TODO VALID PATH
JAR_PATH='../out/artifacts/vype_jar/vype.jar'

parser = argparse.ArgumentParser(description="Runs all tests if no parameter is provided.")
parser.add_argument("-s", "--semantic", help="Runs semantic tests", action="store_true")
parser.add_argument("-l", "--lexical", help="Runs lexical tests", action="store_true")
parser.add_argument("-x", "--syntactic", help="Runs syntactic tests", action="store_true")
parser.add_argument("-v", "--valid", help="Runs valid tests", action="store_true")

args = parser.parse_args()

# default is to run all tests
if not (args.semantic or args.lexical or args.syntactic or args.valid):
    args.semantic = True
    args.syntactic = True
    args.lexical = True
    args.valid = True

def run_tests(type, folder, returnCode):
    files = glob.glob(folder)
    start_section(type)

    for file in files:
        testcase = re.search("\\\\(.+)\.c$", file).group(1)
        fileHandler = open(file, 'r')
        print(testcase + ": " + fileHandler.readline())
        fileHandler.close()

        try:
            subprocess.check_output(['java', '-jar', JAR_PATH, file])
        except subprocess.CalledProcessError as e:
            if e.returncode == returnCode:
                message = "PASSED"
            else:
                message = "FAILED"
                # STACK TRACE
                # print(e.output)

            print(message)


def run_valid_tests(folder):
    run_tests("Valid", folder, 0)
    # TODO run compiled binaries and check output
    pass

def start_section(type):
    print('*' * 90)
    print('Section ' + type + ' has started')
    print('*' * 90)


if args.semantic:
    run_tests("Semantic", "./semantic_errors/*.c", 3)

if args.syntactic:
    run_tests("Syntactic", "./syntactic_errors/*.c", 2)

if args.lexical:
    run_tests("Lexical", "./lexical_errors/*.c", 1)

if args.valid:
    pass
    #run_valid_tests("./valid/*.c")
