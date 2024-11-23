from abc import ABC, abstractmethod

class Chart(ABC):
    def __init__(self, renderer):
        self.renderer = renderer

    @abstractmethod
    def plot(self,data):
        pass

class BarChart(Chart):
    def plot(self, data):
        self.renderer.render_bars(data)

class LineChart(Chart):
    def plot(self, data):
        self.renderer.render_lines(data)

