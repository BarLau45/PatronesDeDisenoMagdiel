import numpy as np
from chart import BarChart, LineChart
from renderer import ASCIIRenderer, MatplotlibRenderer

if __name__ == '__main__':
    data = np.random.randint(1, 10, 20)

    ascii_renderer = ASCIIRenderer()
    bar_chart_ascii = BarChart(ascii_renderer)
    line_chart_ascii = LineChart(ascii_renderer)

    print("Ascii")
    bar_chart_ascii.plot(data)
    print("Matplotlib")
    line_chart_ascii.plot(data)

    matplotlib_renderer = MatplotlibRenderer()
    bar_chart_matplotlib = BarChart(matplotlib_renderer)
    line_chart_matplotlib = LineChart(matplotlib_renderer)

    bar_chart_matplotlib.plot(data)
    line_chart_matplotlib.plot(data)