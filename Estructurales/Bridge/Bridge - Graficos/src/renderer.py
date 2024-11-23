from abc import ABC, abstractmethod
import matplotlib.pyplot as plt

class Renderer(ABC):
    @abstractmethod
    def render_bars(self, data):
        pass

    @abstractmethod
    def render_lines(self, data):
        pass

class ASCIIRenderer(Renderer):
    def render_bars(self, data):
        for index, value in enumerate(data):
            print(f"{index}: " + "#" * int(value))

    def render_lines(self, data):
        max_height = max(data)
        for i in range(max_height, 0, -1):
            line = ""
            for value in data:
                line += "o" if value >= i else " "
            print(line)

class MatplotlibRenderer(Renderer):
    def render_bars(self, data):
        plt.bar(range(len(data)), data)
        plt.title("Bar")
        plt.show()

    def render_lines(self, data):
        plt.plot(data)
        plt.title("Line")
        plt.show()