import python_solution
from jpype import startJVM, shutdownJVM, java, addClassPath, JClass, JInt, JImplements
import jpype.imports
jpype.startJVM()
from com.test import BinaryConverter

@JImplements(BinaryConvertor)
def nothing():
    num_to_binary = JClass('BinaryConverter')
    return (num_to_binary)
print(nothing())
shutdownJVM()