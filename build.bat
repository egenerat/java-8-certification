dir /s /B *.java > sources.txt

:: @ to tell Javac it's a file list
javac @sources.txt

"C:\Program Files\Java\jdk1.8.0_25\bin\javac" oca/chap1Blocks/*.java oca/chap2OperatorsAndStatements/*.java oca/chap3CoreJavaAPIs/*.java oca/chap4MethodsAndEncapsulation/*.java oca/chap5ClassDesign/*.java oca/chap6Exceptions/*.java oca/package03_22_full_revisions/*.java oca/offTopicExam/*.java
rm sources.txt