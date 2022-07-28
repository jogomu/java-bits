JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = Main.java Chunk.java Pool.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
